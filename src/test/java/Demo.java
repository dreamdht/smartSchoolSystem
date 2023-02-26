
import com.flyfish.mapper.*;
import com.flyfish.pojo.Classes;
import com.flyfish.service.ClassesService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.List;


/**
 * @autohr flyfish
 * @date: 2023/2/25 21:16
 * @description:
 */
public class Demo {
    @Autowired
    public ClassesMapper classesMapper;

    @Autowired
    private KidsMapper kidsMapper;

    @Autowired
    private ParentMapper parentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Autowired
    private ClassesService classesService;


    @Test
    public void demo01(){
        System.out.println("=============="+classesMapper);
        List<Classes> allClass = classesMapper.getAllClass();
        System.out.println(allClass);

        new ClassesMapper().getAllClass().forEach(System.out::println);
    }

    @Test
    public void demo02(){
        ClassPathXmlApplicationContext app = new ClassPathXmlApplicationContext("application.xml");
        ClassesMapper ddd = app.getBean("ddd", ClassesMapper.class);
        ddd.getAllClass().forEach(System.out::println);
        System.out.println(ddd);
    }

    @Test
    public void demo03(){
        List<Classes> all = classesService.getAll();
        System.out.println(all);
    }

}
