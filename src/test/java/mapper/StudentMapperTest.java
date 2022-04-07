package mapper;

import com.baomidou.mybatisplus.core.MybatisSqlSessionFactoryBuilder;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import data.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：Mybatis_Plus_ActiveRecord实现查询操作
 * Package(包名): mapper
 * Class(测试类名): StudentMapperTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/4/7
 * Time(创建时间)： 16:44
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class StudentMapperTest
{
    /**
     * Query.
     * selectById
     *
     * @throws Exception the exception
     */
    @Test
    public void query() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        student.setStudent_no(202012340112L);

        student = student.selectById();

        System.out.println(student);

        //sqlSession.close();

    }

    /**
     * Query.
     * selectById
     *
     * @throws Exception the exception
     */
    @Test
    public void query1() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        //student.setStudent_no(202012340112L);

        student = student.selectById(202012340112L);

        System.out.println(student);

        //sqlSession.close();

    }

    /**
     * Query.
     * selectAll
     *
     * @throws Exception the exception
     */
    @Test
    public void query2() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        //student.setStudent_no(202012340112L);

        List<Student> list = student.selectAll();

        for (Student student1 : list)
        {
            System.out.print(student1);
        }

        System.out.println("数量：" + list.size());
    }

    /**
     * Query.
     * selectList
     *
     * @throws Exception the exception
     */
    @Test
    public void query3() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        //student.setStudent_no(202012340112L);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("class_no", 1001L);

        List<Student> list = student.selectList(queryWrapper);

        for (Student student1 : list)
        {
            System.out.print(student1);
        }

        System.out.println("数量：" + list.size());
    }

    /**
     * Query.
     * selectOne
     *
     * @throws Exception the exception
     */
    @Test
    public void query4() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        //student.setStudent_no(202012340112L);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("class_no", 1001L);

        //警告: Warn: execute Method There are  61 results.
        List<Student> list = Collections.singletonList(student.selectOne(queryWrapper));

        for (Student student1 : list)
        {
            System.out.print(student1);
        }

        System.out.println("数量：" + list.size());
    }

    /**
     * Query.
     * selectOne
     *
     * @throws Exception the exception
     */
    @Test
    public void query5() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        //student.setStudent_no(202012340112L);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("student_no", 202012340112L);

        List<Student> list = Collections.singletonList(student.selectOne(queryWrapper));

        for (Student student1 : list)
        {
            System.out.print(student1);
        }

        System.out.println("数量：" + list.size());
    }

    /**
     * Query.
     * selectCount
     *
     * @throws Exception the exception
     */
    @Test
    public void query6() throws Exception
    {
        String resource = "mybatis-config.xml";
        //读取配置文件mybatis-config.xml
        InputStream config = Resources.getResourceAsStream(resource);
        //根据配置文件构建SqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new MybatisSqlSessionFactoryBuilder().build(config);
        //通过SqlSessionFactory创建SqlSession
        //SqlSession sqlSession = sqlSessionFactory.openSession();
        Student student = new Student();
        //student.setStudent_no(202012340112L);

        QueryWrapper<Student> queryWrapper = new QueryWrapper<>();
        queryWrapper.gt("student_no", 202012340112L);

        long count = student.selectCount(queryWrapper);

        System.out.println("数量：" + count);
    }
}