package com.daw.basquet.data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
@Service
public class EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    public void testEquipo(){
        Equipo riells = new Equipo("RiellsBC","RiellsDelMontseny",LocalDate.of(1999, 1,1));
        equipoRepository.save(riells);

        Equipo santCeloni = new Equipo("UESC","SantCeloni",LocalDate.of(1989, 1,1));
        equipoRepository.save(santCeloni);

        Equipo laBatlloria = new Equipo("CB.Batlloria","LaBatlloria", LocalDate.of(1945,5,8));
        equipoRepository.save(laBatlloria);

        Equipo breda = new Equipo("BredaBC", "Breda", LocalDate.of(1968,8,26));
        equipoRepository.save(breda);

        Equipo vallgorguina = new Equipo("CBSC", "SantCeloni", LocalDate.of(1987, 3,2));
        equipoRepository.save(vallgorguina);

        Equipo algo = new Equipo("algo", "algolona", LocalDate.of(1987, 3,2));
        equipoRepository.save(algo);
    }
}
