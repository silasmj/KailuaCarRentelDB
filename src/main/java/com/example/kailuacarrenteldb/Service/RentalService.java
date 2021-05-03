package com.example.kailuacarrenteldb.Service;

import com.example.kailuacarrenteldb.Model.Rental;
import com.example.kailuacarrenteldb.Repository.RentalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalService {
    @Autowired
    RentalRepo rentalRepo;

    public List<Rental> showRental(){
        return rentalRepo.showRental();
    }

    public Rental addRental(Rental r){
        return rentalRepo.addRental(r);
    }

    public Rental findRentalById(int rental_id){
        return rentalRepo.findRentalById(rental_id);
    }

    public Boolean deleteRental(int rental_id){
        return rentalRepo.deleteRental(rental_id);
    }

    public Rental updateRental(int rental_id, Rental r){
        return rentalRepo.updateRental(rental_id, r);
    }
}