package com.daw.basquet.data;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cglib.core.Local;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
@Service
public class JugadorService {

    @Autowired
    private JugadorRepository jugadorRepository;

    @Autowired
    private EquipoRepository equipoRepository;

    public void testJugador() {
        Jugador shyaporn = new Jugador("shyaporn",LocalDate.of(1989, 1, 2),4,2,8,"base");
        shyaporn.setEquipo(equipoRepository.findByName("RiellsBC"));
        jugadorRepository.save(shyaporn);

        Jugador jordan = new Jugador("jordan",LocalDate.of(1972, 10, 2),4,1999,88,"base");
        jordan.setEquipo(equipoRepository.findByName("RiellsBC"));
        jugadorRepository.save(jordan);

        Jugador bone = new Jugador("bone",LocalDate.of(1974, 10, 5),9,19,8,"base");
        bone.setEquipo(equipoRepository.findByName("RiellsBC"));
        jugadorRepository.save(bone);

        Jugador torquemada = new Jugador("torquemada",LocalDate.of(1425, 1, 29),568,1587,1547,"base");
        torquemada.setEquipo(equipoRepository.findByName("RiellsBC"));
        jugadorRepository.save(torquemada);

        Jugador andreu = new Jugador("andreu",LocalDate.of(1984, 8, 29),15,25,17,"Alero");
        andreu.setEquipo(equipoRepository.findByName("RiellsBC"));
        jugadorRepository.save(andreu);

        Jugador landa = new Jugador("landa",LocalDate.of(1986, 10, 8),7,17,45,"Alero");
        landa.setEquipo(equipoRepository.findByName("UESC"));
        jugadorRepository.save(landa);

        Jugador ramon = new Jugador("ramon",LocalDate.of(1964, 1, 21),4,8,9,"Pivot");
        ramon.setEquipo(equipoRepository.findByName("UESC"));
        jugadorRepository.save(ramon);

        Jugador delgado = new Jugador("delgado",LocalDate.of(1991, 4, 24),8,9,17,"Pivot");
        delgado.setEquipo(equipoRepository.findByName("UESC"));
        jugadorRepository.save(delgado);

        Jugador estatua = new Jugador("estatua",LocalDate.of(1984, 7, 17),5,2,7,"Alero");
        estatua.setEquipo(equipoRepository.findByName("UESC"));
        jugadorRepository.save(estatua);

        Jugador chapa = new Jugador("Pote",LocalDate.of(1982, 3, 4),6,8,2,"Alero");
        chapa.setEquipo(equipoRepository.findByName("UESC"));
        jugadorRepository.save(chapa);

        Jugador kelvin = new Jugador("kelvin", LocalDate.of(1996,1,27),1,6,5,"aleron");
        kelvin.setEquipo(equipoRepository.findByName("CB.Batlloria"));
        jugadorRepository.save(kelvin);

        Jugador saiden = new Jugador("saiden",LocalDate.of(1996,12,24),2,2,3,"base");
        saiden.setEquipo(equipoRepository.findByName("CB.Batlloria"));
        jugadorRepository.save(saiden);

        Jugador sergi = new Jugador("sergi", LocalDate.of(1996, 11, 21),3,0,2,"pivot");
        sergi.setEquipo(equipoRepository.findByName("CB.Batlloria"));
        jugadorRepository.save(sergi);

        Jugador aleix = new Jugador("aleix", LocalDate.of(1995,7,4),1,1,1,"aleron");

        aleix.setEquipo(equipoRepository.findByName("CB.Batlloria"));
        jugadorRepository.save(aleix);

        Jugador zerus = new Jugador("zerus", LocalDate.of(1994,4,14),4,3,4,"base");
        zerus.setEquipo(equipoRepository.findByName("CB.Batlloria"));
        jugadorRepository.save(zerus);

        Jugador pablo = new Jugador("pablo",LocalDate.of(1996,5,17),2,3,2,"pivot");
        pablo.setEquipo(equipoRepository.findByName("BredaBC"));
        jugadorRepository.save(pablo);

        Jugador josep = new Jugador("josep",LocalDate.of(1996,3,8),3,5,4,"aleron");
        josep.setEquipo(equipoRepository.findByName("BredaBC"));
        jugadorRepository.save(josep);

        Jugador pau = new Jugador("pau",LocalDate.of(1996,7,12),1,2,3,"base");
        pau.setEquipo(equipoRepository.findByName("BredaBC"));
        jugadorRepository.save(pau);

        Jugador joan = new Jugador("joan",LocalDate.of(1995,1,3),2,3,4,"pivot");
        joan.setEquipo(equipoRepository.findByName("BredaBC"));
        jugadorRepository.save(joan);

        Jugador alejandro = new Jugador("alejandro",LocalDate.of(1996,3,23),9,8,7,"aleron");
        alejandro.setEquipo(equipoRepository.findByName("BredaBC"));
        jugadorRepository.save(alejandro);

        Jugador alex= new Jugador("alex",LocalDate.of(1987,10,3),8,9,5,"base");
        alex.setEquipo(equipoRepository.findByName("CBSC"));
        jugadorRepository.save(alex);

        Jugador berjen = new Jugador("berjen",LocalDate.of(1990,3,7),5,1,2,"pivot");
        berjen.setEquipo(equipoRepository.findByName("CBSC"));
        jugadorRepository.save(berjen);

        Jugador darien = new Jugador("darien",LocalDate.of(1989,1,10),11,6,4,"aleron");
        darien.setEquipo(equipoRepository.findByName("CBSC"));
        jugadorRepository.save(darien);

        Jugador faker= new Jugador("faker",LocalDate.of(1993,7,17),10,10,10,"base");
        faker.setEquipo(equipoRepository.findByName("CBSC"));
        jugadorRepository.save(faker);

        Jugador darc = new Jugador("darc",LocalDate.of(1428,12,1),1,6,0,"pivot");
        darc.setEquipo(equipoRepository.findByName("CBSC"));
        jugadorRepository.save(darc);

        //Introduucido Cambio tronco


        System.out.println("==============================================================");

        System.out.println("Buscar por frangmento de nombre: Lan");
        System.out.println(jugadorRepository.findByNombreContaining("lan"));

        System.out.println("==============================================================");

        System.out.println("Canastas mayores a 6: ");
        System.out.println(jugadorRepository.findByNumCanastasBetween(1, 10));

        System.out.println("==============================================================");

        System.out.println("Buscar por posición concreta: ");
        System.out.println(jugadorRepository.findByPosicion("Base"));

        System.out.println("==============================================================");

        System.out.println("Buscar por fecha de naciemiento anterior a 1900: ");
        System.out.println(jugadorRepository.findByFechaNacimientoBefore(LocalDate.of(1900, 1, 1)));

        System.out.println("==============================================================");

        System.out.println("Agrupar por Posicion y tal: ");
        System.out.println(jugadorRepository.AvgCanastasAndAvgAndNumAsistenciasAndNumRebotesGroupBOrderByPosicion());

        System.out.println("==============================================================");

        System.out.println("Buscar equipo por localidad: ");
        System.out.println(equipoRepository.findByLocation("breda"));

        System.out.println("==============================================================");

        System.out.println("Buscar Jugadores por Equipo: ");
        System.out.println(jugadorRepository.findByEquipoName("cb.batlloria"));
        System.out.println("==============================================================");

        System.out.println("Buscar Jugadores por Equipo, y posición, tronco: ");
        System.out.println(jugadorRepository.findByEquipoNameAndPosicion("bredaBC","aleron"));

        System.out.println("==============================================================");

        System.out.println("Buscar el que mas canastas ha marcado de un Equipo, loko: ");
        System.out.println(jugadorRepository.findTopByEquipoNameOrderByNumCanastasDesc("bredaBC"));
    }
}