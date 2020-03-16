package cc.oldx.modules.security.bo;

import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.mbg.domain.OSysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

/**
 * @Author: moli
 * @Email: 974751082@qq.com
 * @qq: 974751082
 * @Date: 2020/3/16 16:39
 */
public class OSysUserDetails implements UserDetails {
    private OSysUser oSysUser;
    private List<OSysMenu> menusList;

    public OSysUserDetails(OSysUser oSysUser, List<OSysMenu> menusList) {
        this.oSysUser = oSysUser;
        this.menusList = menusList;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return oSysUser.getPassword();
    }

    @Override
    public String getUsername() {
        return oSysUser.getUsername();
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
