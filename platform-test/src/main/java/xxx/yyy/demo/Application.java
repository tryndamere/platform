package xxx.yyy.demo;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.fc.platform.commons.page.Pageable;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import xxx.yyy.demo.entity.TestTable;
import xxx.yyy.demo.persistence.TestTableMapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by serv on 2015/6/23.
 */
@SpringBootApplication
@MapperScan("xxx.yyy.demo.persistence")
public class Application implements CommandLineRunner {

    @Autowired
    TestTableMapper testTableMapper;


    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


    public void run(String... args) throws Exception {
//        for (int i = 0 ; i<15 ; i++) {
//            TestTable testTable = new TestTable();
//            testTable.setId(UUID.randomUUID().toString());
//            testTable.setName(UUID.randomUUID().toString());
//            testTable.setAge("22234343455");
//            testTable.setBz("备注");
//            testTableMapper.insert(testTable);
//        }
        Pageable pageable = new PageRequest(1 , 10);
        Page<TestTable> testTables = testTableMapper.searchTestAByParams(null , pageable);
        Map<String , String> paramMap = new HashMap<String, String>(1);
        paramMap.put("name", "a72e63fd-2587-4519-99a4-ea6db8f107f9");
        List<TestTable> testTables1 = testTableMapper.searchTestAByParams(paramMap);
        System.out.println(testTables.toString());
    }
}
