package test.loginweb.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import test.loginweb.entity.user;

public interface userMapper extends BaseMapper<user> {

}
