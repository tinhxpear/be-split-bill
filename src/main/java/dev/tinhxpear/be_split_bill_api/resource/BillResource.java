package dev.tinhxpear.be_split_bill_api.resource;

import dev.tinhxpear.be_split_bill_api.model.Bill;
import dev.tinhxpear.be_split_bill_api.repository.BillRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/bill")
public class BillResource {
    private BillRepository friendRepository;

    @GetMapping("")
    public List<Bill> findAll(){
        return friendRepository.findAll();
    }
    @PostMapping("")
    public void create(@RequestBody Bill user){
        friendRepository.save(user);
    }

    @GetMapping("/{id}")
    public Bill findById(@PathVariable String id) {
        return friendRepository.findById(id).orElse(null);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable String id) {
        friendRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateById(@RequestBody Bill newBill, @PathVariable String id){
        friendRepository.deleteById(id);
        newBill.setId(id);
        friendRepository.save(newBill);
    }
}
