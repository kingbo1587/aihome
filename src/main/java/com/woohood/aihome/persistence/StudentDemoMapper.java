package com.woohood.aihome.persistence;

import com.woohood.aihome.model.StudentDemo;
import com.woohood.aihome.model.StudentDemoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentDemoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int countByExample(StudentDemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int deleteByExample(StudentDemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int insert(StudentDemo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int insertSelective(StudentDemo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    List<StudentDemo> selectByExample(StudentDemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    StudentDemo selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int updateByExampleSelective(@Param("record") StudentDemo record, @Param("example") StudentDemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int updateByExample(@Param("record") StudentDemo record, @Param("example") StudentDemoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int updateByPrimaryKeySelective(StudentDemo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table student_demo
     *
     * @mbggenerated Wed Feb 24 11:16:49 CST 2016
     */
    int updateByPrimaryKey(StudentDemo record);
}