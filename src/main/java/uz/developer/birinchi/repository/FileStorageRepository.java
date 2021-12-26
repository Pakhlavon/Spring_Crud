package uz.developer.birinchi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.developer.birinchi.domain.FileStorage;
import uz.developer.birinchi.domain.FileStorageStatus;

import java.util.List;

@Repository
public interface FileStorageRepository extends JpaRepository<FileStorage, Long> {

    FileStorage findByHashId(String hashId);

    List<FileStorage> findByFileStorageStatus(FileStorageStatus status);
}
