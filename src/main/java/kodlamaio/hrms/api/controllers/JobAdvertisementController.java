package kodlamaio.hrms.api.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.JobAdvertisementService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;

import kodlamaio.hrms.entities.concretes.JobAdvertisement;

import kodlamaio.hrms.entities.dtos.JobAdvertisementAddDto;
import kodlamaio.hrms.entities.dtos.JobAdvertisementListDto;
@RestController
@RequestMapping("/api/jobadvertisement")
public class JobAdvertisementController{
  private JobAdvertisementService jobadvertisementService;
  @Autowired
  public JobAdvertisementController(JobAdvertisementService jobadvertisementService){
    super();
    this.jobadvertisementService = jobAdvertisementService
  }
  @GetMapping("/getall")
  public DataResult<List<jobadvertisement>> getall() {
    return this.jobadvertisementService.getall();
  }
  @GetMapping("/findById")
  public DataResult<List<jobadvertisement>> findById() {
    return this.jobadvertisementService.findById();
  }
  @GetMapping("/findByAllEnable")
	public DataResult<List<JobAdvertisementListDto>> findByAllEnable() {
		return this.jobAdvertisementService.findByAllEnable();
	}
  @GetMapping("/findByEnableTrueOrderByCreatedAtAsc")
  	public DataResult<List<JobAdvertisementListDto>> findByAllEnable() {
		    return this.jobAdvertisementService.findByEnableTrueOrderByCreatedAtAsc();
  	}
  	@GetMapping("/findByEnableTrueOrderByApplicationDateDesc")
	public DataResult<List<JobAdvertisementListDto>> findByEnableTrueOrderByApplicationDateDesc() {
			return this.jobAdvertisementService.findByEnableTrueOrderByApplicationDateDesc();
	}
	@GetMapping("/findByEmployerIdAndEnableTrue")
	public DataResult<List<JobAdvertisementListDto>>  findByEmployerIdAndEnableTrue(@RequestBody int id){
			return this.jobAdvertisementService.findByEmployerIdAndEnableTrue( id);
	}
	@GetMapping("/findByEnableTrueAndCompanyName")
	public DataResult<List<JobAdvertisementListDto>>  findByEnableTrueAndEmployer_CompanyName(@RequestBody String companyName) {
			return this.jobAdvertisementService.findByEnableTrueAndEmployer_CompanyName(companyName);
	}
	@PostMapping("/add")
	public List<Result> add(@RequestBody  JobAdvertisementAddDto jobAdvertisementsDto) {
		return this.jobAdvertisementService.add(jobAdvertisementsDto);
	}

}
  
  
  
}

 