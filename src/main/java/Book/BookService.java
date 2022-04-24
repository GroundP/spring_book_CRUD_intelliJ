package Book;

import java.util.List;
import java.util.Map;

public interface BookService {

	String create(Map<String, Object> map);

	Map<String, Object> detail(Map<String, Object> map);

	boolean edit(Map<String, Object> map);

	boolean delete(Map<String, Object> map);

	List<Map<String, Object>> showList(Map<String, Object> map);

}
