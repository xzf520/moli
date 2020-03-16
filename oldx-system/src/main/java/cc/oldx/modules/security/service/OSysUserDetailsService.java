package cc.oldx.modules.security.service;

import cc.oldx.modules.system.service.OAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 15:39
 */
@Configuration
public class OSysUserDetailsService implements UserDetailsService {
    @Autowired
    private OAdminService oAdminService;

    @Autowired

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
