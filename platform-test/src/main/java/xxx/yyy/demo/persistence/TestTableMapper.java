package xxx.yyy.demo.persistence;

import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.Pageable;
import org.apache.ibatis.annotations.Param;
import xxx.yyy.demo.entity.TestTable;

import java.util.List;
import java.util.Map;

/**
 * Created by serv on 2014/7/8.
 */
public interface TestTableMapper {

    Page<TestTable> searchTestAByParams(@Param("map")Map<String , String> map , Pageable pageable);

    List<TestTable> searchTestAByParams(@Param("map")Map<String , String> map);

}
