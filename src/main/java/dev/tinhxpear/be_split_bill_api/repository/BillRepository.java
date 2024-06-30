package dev.tinhxpear.be_split_bill_api.repository;

import dev.tinhxpear.be_split_bill_api.model.Bill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource
public interface BillRepository extends JpaRepository<Bill, String> {

}
