package rmignac.bonsai.infrastructure;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import rmignac.bonsai.infrastructure.BonsaiEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface BonsaiDao extends JpaRepository<BonsaiEntity, UUID> {

//    @Query("SELECT b FROM bonsai b WHERE b.status = ?1")
//    List<BonsaiEntity> findAllWithStatus(String status, Sort sort);
//
    @Query("SELECT b FROM bonsai b WHERE (:status is null or b.status = :status)")
    List<BonsaiEntity> findAllWithStatus(@Param("status") String status);
    @Query("SELECT b FROM bonsai b WHERE b.acquisition_age >= :acquisition_age")
    List<BonsaiEntity> findAllOlderByAge(@Param("acquisition_age") int age);

    @Query("SELECT b FROM bonsai b WHERE b.nom = :nom")
    Optional<BonsaiEntity> findByName(@Param("nom") String nom);

}