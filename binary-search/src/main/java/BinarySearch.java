import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BinarySearch {
    
    List<Integer> list = new ArrayList<Integer>();
    double index = 0;

    BinarySearch(List<Integer> items) {
        this.list = items;
    }

    int indexOf(int item) throws ValueNotFoundException {

        // int numElems = this.list.size();
        // int elem = this.list.get(numElems / 2);

        // if ( elem == item ) {
        //     return this.index + numElems / 2 +1;
        // } else if ( elem > item ) {
        //     this.list = this.list.subList(0, numElems/2);
        //     return this.index + indexOf(item);
        // } else {
        //     this.list = this.list.subList(numElems/2+1, numElems);
        //     this.index += numElems / 2 +1;
        //     return this.index + indexOf(item);
        // }
        
        // throw new ValueNotFoundException("Value not in array");



        // The algorithm looks like this:
        // Find the middle element of a sorted list and compare it with the item we're looking for.
        
        int numElements = this.list.size();

        if (numElements == 0)
            throw new ValueNotFoundException("Value not in array");

        Integer element = this.list.get(numElements / 2);

        switch (Integer.compare(element, item)) {
            case 0: // If the middle element is our item, then we're done!
                return (int) (this.index + (numElements/2.0));

            case 1: // If the middle element is greater than our item, 
                    // we can eliminate that element and all the elements after it.
                this.list = this.list.subList(0, numElements/2);
                return indexOf(item);
            
            case -1: // If the middle element is less than our item, 
                     // we can eliminate that element and all the elements before it.
                this.list = this.list.subList(numElements/2 +1, numElements);
                this.index += (numElements/2 +1);
                return indexOf(item);

            default:
                return 0;
        }




        // int index = items.indexOf(item);
        
        // if (index != -1) {
        //     return index;
        // } else {
        //     throw new ValueNotFoundException("Value not in array");
        // }
    }

}
