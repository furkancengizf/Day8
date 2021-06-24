package kodlamaio.hrms.business.abstracts;


import java.util.List;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobAdvertisement;
import kodlamaio.hrms.entities.dtos.JobAdvertisementsDto;

public interface JobAdvertisementService {
  
  JobAdvertisement findById(int id);
  List<Result> add(JobAdvertisementsDto jobAdvertisementsDto);
  DataResult<List<JobAdvertisement> getall();
  DataResult<List<JobAdvertisement> findByAllEnable();
  DataResult<List<JobAdvertisement> findByAllEnableTrueOrderCreatedAsc();
  DataResult<List<JobAdvertisement>findByAllEnableTrueOrderByApplicationDateDesc();
  DataResult<List<JobAdvertisement> findByEmployerIdAndEnableTrue(int id);
  DatResult<List<JobAdvertisement>> findByAllEnableTrueAndEmployer_CompanyName(String companyName)
  
}