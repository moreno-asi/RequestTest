package service;

import model.AgencyNews;
import model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.AgencyNewsRepository;
import repository.ImageRepository;

import java.util.List;

@Service
public class MongoService {

    @Autowired
    private ImageRepository imageRepository;

    @Autowired
    private AgencyNewsRepository agencyNewsRepository;

    public List<Image> getAllFromDatabase1() {
        return imageRepository.findAll();
    }

    public List<AgencyNews> getAllFromDatabase2() {
        return agencyNewsRepository.findAll();
    }

}
