package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import web.dao.CarDAO;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    CarDAO daoInterface;

    @Override
    public List<Car> getCars(int count) {
        return daoInterface.getCars(count);
    }
}
