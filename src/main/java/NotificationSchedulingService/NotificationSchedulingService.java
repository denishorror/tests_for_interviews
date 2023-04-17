//package com.safephone.service;
//
//import com.safephone.config.NotificationConfig;
//import com.safephone.domain.Admin;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.SchedulingConfigurer;
//import org.springframework.scheduling.config.ScheduledTaskRegistrar;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.concurrent.CopyOnWriteArrayList;
//import java.util.concurrent.atomic.AtomicBoolean;
//
//import static com.safephone.db.Args.PAGE_MAX_SIZE;
//
//@Slf4j
//@Service
////@ConditionalOnProperty(prefix = "sp.notification.to_admin", value = "enabled", havingValue = "true")
//public class NotificationSchedulingService implements SchedulingConfigurer {
//
//    final private CopyOnWriteArrayList<Admin> adminList = new CopyOnWriteArrayList<>();
//    private AtomicBoolean adminListMustBeRefresh = new AtomicBoolean(true);
//    private AtomicBoolean busy = new AtomicBoolean(false);
//
//    private final NotificationConfig notificationConfig;
//    private final AdminService adminService;
//    private final NotificationService notificationService;
//
//
//    @Autowired
//    public NotificationSchedulingService(NotificationConfig notificationConfig, AdminService adminService,
//                                         NotificationService notificationService) {
//        this.notificationConfig = notificationConfig;
//        this.adminService = adminService;
//        this.notificationService = notificationService;
//    }
//
//    /**
//     * Флаг необходимости обновить список админов с ближайшим уведомлением
//     *
//     * @param mustBeRefresh  true - перед выполнением очередного цикла выполнения возможного уведомления требуется
//     *                       обновить список админов с ближайшим уведомлением
//     */
//    public void setAdminListMustBeRefresh(boolean mustBeRefresh) {
//        this.adminListMustBeRefresh.set(mustBeRefresh);
//    }
//
//    public List<Object> readDataFromDbByCursor_1(boolean mustBeRefresh) {
//        return adminService.readDataFromDbByCursor();
//    }
//
//    private void notifyLockedOrUnlockedAdmins() {
//        if (!notificationConfig.isSendNotifications()) {
//            return;
//        }
//        if(!busy.compareAndSet(false, true)){
//            return;
//        }
//        if (adminListMustBeRefresh.get()) {
//            // при запуске или по требованию
//            this.adminList.addAll(adminService.findAdminWithMailForNotification(0, PAGE_MAX_SIZE));
//            adminListMustBeRefresh.set(false);
//        }
//
//        // в adminList приходят ближайшие админы на уведомление по блокировке/разблокировке
//        // действие зависит от текущей блокировки админа
//        // если заблокирован, то уведомить о разблокировке
//        // если разблокирован, то уведомить о блокировке
//
//        this.adminList
//                .forEach(admin -> {
//
//                    try {
//                        if (!admin.isAdmIsLocked()) {
//                            notificationService.mailLockAdmin(admin.getAdmEmail());
//                        } else {
//                            notificationService.mailUnLockAdmin(admin.getAdmEmail());
//                        }
//                    } catch (Exception e) {
//                        String s = String.format("Bad notify admin by email: %s", admin.getLogin());
//                        log.error(s, e);
//                    }
//                });
//    }
//
//    @Override
//    public void configureTasks(ScheduledTaskRegistrar taskRegistrar) {
//        if(!notificationConfig.isSendNotifications()){
//            return;
//        }
//        log.info("Init NotificationSchedulingService");
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    notifyLockedOrUnlockedAdmins();
//                }catch (Exception e){
//                    log.error("", e);
//                }
//            }
//        };
//        taskRegistrar.addFixedDelayTask(runnable, 10 * 1000);
//    }
//}
