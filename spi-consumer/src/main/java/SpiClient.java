import com.jd.demospi.People;

import java.util.Iterator;
import java.util.ServiceLoader;

public class SpiClient {

    public static void main(String[] args) {

        ServiceLoader<People> people = ServiceLoader.load(People.class);
        Iterator<People> iterator = people.iterator();

        while (iterator.hasNext()) {
            People pp = iterator.next();
            System.out.println(pp);

            pp.speak();
        }

    }
}
