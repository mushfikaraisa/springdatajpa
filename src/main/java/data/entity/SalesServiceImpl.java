package data.entity;

import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class SalesServiceImpl implements SalesService {

	private final SalesRepository salesRepository;

	public SalesServiceImpl(SalesRepository salesRepository) {
		this.salesRepository = salesRepository;
	}

	@Override
	public Sales getSale(int id) {
		Optional<Sales> sale = salesRepository.findById(id);
		return sale.orElse(null);
	}

}
