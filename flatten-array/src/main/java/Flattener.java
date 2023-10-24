import java.util.ArrayList;
import java.util.List;

class Flattener {

    <T> List<T> flatten(List<T> list) {
        
        List<T> flattenList = new ArrayList<>();

        for (Object element : list) {

            if (element instanceof List) {
                flattenList.addAll(flatten((List<T>) element));
            } else {
                if (element == null)
                    continue;

                flattenList.add((T) element);
            }

        }

        return flattenList;

    }

}