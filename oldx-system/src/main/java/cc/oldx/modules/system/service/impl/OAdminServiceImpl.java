package cc.oldx.modules.system.service.impl;

import cc.oldx.mbg.domain.OSysUser;
import cc.oldx.modules.system.dto.OSysUserParam;
import cc.oldx.modules.system.service.OAdminService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 15:55
 */
@Service
public class OAdminServiceImpl implements OAdminService {
    @Override
    public OSysUser getAdminByUsername(String username) {
        return null;
    }

    @Override
    public OSysUser register(OSysUserParam OSysUserParam) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String refreshToken(String oldToken) {
        return null;
    }

    @Override
    public OSysUser getItem(Long id) {
        return null;
    }

    @Override
    public List<OSysUser> list(String name, Integer pageSize, Integer pageNum) {
        return null;
    }

    @Override
    public int update(Long id, OSysUser admin) {
        return 0;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }
}
