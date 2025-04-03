package com.alxy.notificationservice.repository;

import com.alxy.notificationservice.entity.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author 李尚奇
 * @date 2025/4/2
 */
public interface NotificationRepository extends JpaRepository<Notification, String> {
    /**
     *
     * @param clientId
     * @return
     */
    List<Notification> findByClientId(String clientId);

    /**
     *
     * @param clientId
     * @param type
     * @return
     */
    List<Notification> findByClientIdAndType(String clientId, String type);

}