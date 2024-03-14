package at.htl.minikube.repository;

import at.htl.minikube.entity.Vehicle;
import io.quarkus.test.junit.QuarkusTest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Disabled // disable unit test
@QuarkusTest
class VehicleRepositoryTest {
    @Inject
    VehicleRepository repository;

    @Test
    @Transactional
    void createRecordSmokeTest() {
        Vehicle car = new Vehicle( "Opel", "Kadett" );
        repository.persist( car );
    }
}