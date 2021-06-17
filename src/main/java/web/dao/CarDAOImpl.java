package web.dao;

import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class CarDAOImpl implements CarDAO {
    private static List<Car> list = new ArrayList<>();
    static {
        list.add(new Car(1, "Toyota", "sedan"));
        list.add(new Car(2, "Honda", "sportCar"));
        list.add(new Car(3, "Tesla", "electroCar"));
        list.add(new Car(4, "VAZ", "taz"));
        list.add(new Car(5, "Audi", "vagon"));
    }
    @Override
    public List<Car> getCars(int count) {
        List<Car> listCars = new ArrayList<>();
        Iterator<Car> iter = listCars.iterator();
        while(iter.hasNext()){
            if(count==0){
                break;
            }
            Car element = iter.next();
            listCars.add(element);
            count--;
        }
        return listCars;
    }


}
