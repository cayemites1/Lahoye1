<?php
class  form  extends  CI_CONTROLLER {
	public  function  index(){
		/*load  form  helper  */
			$this->Load->helper(array('form'));
			/*Load  form  validation  library*/
			$this->Load->library('form-validation');
			/*set validation rule for name field in the form*/    
			$this->form_validation->set - rules('name','name','required');
			if($this->form-validation->run()==false)  {  
				$this->Load->view('myform');
				}else{
					$this->Load->view('formsuccess');  
				}               
	}  
	
}
?>