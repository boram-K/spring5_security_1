package edu.kosmo.ex.mapper;

import java.sql.Timestamp;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import edu.kosmo.ex.vo.EmpVO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.log4j.Log4j;

@Mapper
public interface EmpMapper {
	@Select("select * from emp where ename = #{ename}")
	public EmpVO readUser(String name);

}