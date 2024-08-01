import { Component } from '@angular/core';
import { Staff } from '../../model/Staff';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'Management';
  staff:Staff
  constructor(){
    this.staff=new Staff();
  }
 insertStaff(data:any){
    this.staff.staffName=data.staffName;
    this.staff.staffNo=data.staffNo;
    this.staff.staffAdd=data.staffAdd;
    this.staff.staffQuali=data.staffQuali;
    this.staff.staffSub=data.staffSub;
    this.staff.staffJoin=data.staffJoin;
    this.staff.staffMail=data.staffMail;
    this.staff.staffId=data.staffId;
    this.staff.staffExperience=data.staffExperience;    
    this.staff.staffCertificate=data.staffCertificate;    
    this.staff.staffSalary=data.staffSalary;
    alert(data.staffName+" "+data.staffNo+" "+data.staffAdd+" "+data.staffQuali+" "+data.staffSub+" "+data.staffJoin+" "+data.staffMail+" "+data.staffId+" "+data.staffExperience+" "+data.staffCertificate+" "+data.staffSalary);    

  }
}
