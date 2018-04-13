package com.kaishengit.tms.service;

import com.kaishengit.tms.entity.Permission;
import com.kaishengit.tms.entity.Roles;
import com.kaishengit.tms.exception.ServiceException;

import java.util.List;

/**
 * 角色和权限的业务类
 * @author fankay
 */
public interface RolePermissionService {

    /**
     * 添加权限
     * @param permission
     */
    void savePermission(Permission permission);

    /**
     * 根据权限类型查询权限列表
     * @param permissionType 权限类型 菜单|按钮
     * @return 对应的权限列表
     */
    List<Permission> findPermissionByPermissionType(String permissionType);

    /**
     * 查询所有的权限
     * @return
     */
    List<Permission> findAllPermission();

    /**
     * 新增角色
     * @param roles 角色对象
     * @param permissionId 角色对应的权限ID列表
     */
    void saveRoles(Roles roles, Integer[] permissionId);

    /**
     * 根据权限ID删除权限
     * @param id
     * @throws ServiceException 删除失败抛出此异常，例如权限已经被角色使用
     */
    void delPermissionById(Integer id) throws ServiceException;
}
