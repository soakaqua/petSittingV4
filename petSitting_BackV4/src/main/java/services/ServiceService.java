package services;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.ServiceRepository;

@Service
public class ServiceService {
 
	
	@Autowired
	private static ServiceRepository serviceRepository;
	
	
	public model.Service save(model.Service s) {


		model.Service serviceEnBase = null;
		if (s.getNumSer() != null) {
			Optional<model.Service> opt = serviceRepository.findById(s.getNumSer());
			serviceEnBase = opt.get();
			serviceEnBase.setNomSer((s.getNomSer() != null) ? s.getNomSer() : serviceEnBase.getNomSer());
			serviceEnBase.setPrix((s.getPrix() != 0) ? s.getPrix() : serviceEnBase.getPrix());
			serviceRepository.save(serviceEnBase);
			return serviceEnBase;
		}

		else {
			serviceRepository.save(s);
			return s;

		}

	}
}
 	
