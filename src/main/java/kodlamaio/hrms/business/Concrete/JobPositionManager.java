package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.business.constants.Messages;
import kodlamaio.hrms.core.utilities.results.AllDataResult;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;
@Service
public class JobPositionManager implements JobPositionService {
  
  private JobPositionDao jobPositionDao;
  
  @Autowired
  public JobPositionManager(JobPositionDao jobPositionDao){
    
    super();
    this.jobPositionDao = jobPositionDao;
  }
   @Override
   public DataResult<List<JobPosition>> getall();{
     return new SuccessDataResult<List<JobPosition>>(jobPositiod.findAll(), Messages.DataListed)
   }
   
   @Override
   public List<Result> add(JobPosition jobPosition){
     AllDataResult allDataResult = new allDataResult();
     AllDataResult = checkAllFields(jobPosition);
     if(allDataResult.Success()){
       this.jobPositionDao.save(jobPosition);
       AllDataResult.addResult(new SuccessResult(Messages.JobPositionAdded));
       return allDataResult.getSuccessResult();
       
     }
   }
   
   @Override
   public boolean checktitle(String title) {
     List<JobPosition> jobPosition = getall().getdata()
     for (JobPosition jobPosition : jobPosition){
       if(jobPosition.getTitle().equals(title)) {
         return false;
     }
     
     return true;
   }
   @Override
   public AllDataResult checkAllFields(JobPosition jobPosition){
     AllDataResult AllDataResult = new AllDataResult;
     if(!checktitle(jobPosition.getTitle())){
         AllDataResult.addResult(new ErrorResult(Messages.ThisTitleIsAllReadyInTheSystem))
     }
      return AllDataResult;
   }
}
  