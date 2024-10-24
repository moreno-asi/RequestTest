package repository;

import model.AgencyNews;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AgencyNewsRepository extends MongoRepository<AgencyNews,String> {
}
