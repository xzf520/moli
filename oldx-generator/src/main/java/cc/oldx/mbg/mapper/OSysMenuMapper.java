package cc.oldx.mbg.mapper;

import cc.oldx.mbg.domain.OSysMenu;
import cc.oldx.mbg.domain.OSysMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OSysMenuMapper {
    long countByExample(OSysMenuExample example);

    int deleteByExample(OSysMenuExample example);

    int deleteByPrimaryKey(Long menuId);

    int insert(OSysMenu record);

    int insertSelective(OSysMenu record);

    List<OSysMenu> selectByExampleWithBLOBs(OSysMenuExample example);

    List<OSysMenu> selectByExample(OSysMenuExample example);

    OSysMenu selectByPrimaryKey(Long menuId);

    int updateByExampleSelective(@Param("record") OSysMenu record, @Param("example") OSysMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") OSysMenu record, @Param("example") OSysMenuExample example);

    int updateByExample(@Param("record") OSysMenu record, @Param("example") OSysMenuExample example);

    int updateByPrimaryKeySelective(OSysMenu record);

    int updateByPrimaryKeyWithBLOBs(OSysMenu record);

    int updateByPrimaryKey(OSysMenu record);
}