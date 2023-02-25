import com.flyfish.mapper.ClassesMapper;
import com.flyfish.mapper.KidsMapper;
import com.flyfish.mapper.ParentMapper;
import com.flyfish.mapper.TeacherMapper;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @autohr flyfish
 * @date: 2023/2/25 21:16
 * @description:
 */
public class Demo {
    @Autowired
    private ClassesMapper classesMapper;

    @Autowired
    private KidsMapper kidsMapper;

    @Autowired
    private ParentMapper parentMapper;

    @Autowired
    private TeacherMapper teacherMapper;

    @Test
    public void demo01(){

    }
}
