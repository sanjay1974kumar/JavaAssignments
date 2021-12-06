import java.util.List;

public class PolicyCreation {

	public static void main(String[] args) {
		Proposer proposer = new Proposer();
		Agent agent = new Agent();
		Plan plan = new Plan();
		
		proposer.setAge(50);
		proposer.setPaymentMode(6);
		
		plan.setSumAssured(1200000);
		plan.setPlanTerm(10);
		
		agent.setAgentCode("12345A111");
		agent.setName("RAJ");
		
		LICPolicy licpolicy = new LICPolicy();
		PolicyData policyData = licpolicy.data(proposer, agent, plan);
		
		policyData.policyDataList();

	}

}

class LICPolicy extends Policy {
	PolicyData data(Proposer prop, Agent agent, Plan plan) {
		PolicyData policyData = new PolicyData();
		int term = plan.getPlanTerm();
		int sumAssured = plan.getSumAssured();
		int payMode = prop.getPaymentMode();
		int instPrem = (sumAssured/term)/payMode;
		policyData.setPremium(instPrem);
		return policyData;
	}
}

class PolicyData {
	private int premium;
	
	public int getPremium() {
		return premium;
	}

	public void setPremium(int premium) {
		this.premium = premium;
	}

	void policyDataList() {
		
		System.out.println("Policy Premium : " + premium);
	}
}

class Policy {
	private int policyNumber;
	private String commencementDate;
	private float premium;
	private int paymentMode;
	
	public int getPolicyNumber() {
		return policyNumber;
	}
	public void setPolicyNumber(int policyNumber) {
		this.policyNumber = policyNumber;
	}
	public String getCommencementDate() {
		return commencementDate;
	}
	public void setCommencementDate(String commencementDate) {
		this.commencementDate = commencementDate;
	}
	public float getPremium() {
		return premium;
	}
	public void setPremium(float premium) {
		this.premium = premium;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	
}

class Proposer extends Person {
	private Plan plan; 
	private String occupation;
	private float income;
	private int paymentMode;
	private List<Family> family;
	
	public Plan getPlan() {
		return plan;
	}
	public void setPlan(Plan plan) {
		this.plan = plan;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public float getIncome() {
		return income;
	}
	public void setIncome(float income) {
		this.income = income;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	public List<Family> getFamily() {
		return family;
	}
	public void setFamily(List<Family> family) {
		this.family = family;
	}
}

class Family extends Person {
	private String relation;

	public String getRelation() {
		return relation;
	}

	public void setRelation(String relation) {
		this.relation = relation;
	}
}
class Agent extends Person {
	private String agentCode;
	private String branch;
	
	public String getAgentCode() {
		return agentCode;
	}
	public void setAgentCode(String agentCode) {
		this.agentCode = agentCode;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
}

class Person {
	private String gender;
	private int age;
	private String name;
	private String birthDate;
	
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int i) {
		this.age = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
}

class Plan extends PlanType {
	private int planNo;
	private int planTerm;
	private int sumAssured;
	private String planName;
	
	public int getPlanNo() {
		return planNo;
	}
	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}
	public int getPlanTerm() {
		return planTerm;
	}
	public void setPlanTerm(int planTerm) {
		this.planTerm = planTerm;
	}
	public int getSumAssured() {
		return sumAssured;
	}
	public void setSumAssured(int sumAssured) {
		this.sumAssured = sumAssured;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
}

class PlanType {
	private int planNo;
	private String planType;
	
	public int getPlanNo() {
		return planNo;
	}
	public void setPlanNo(int planNo) {
		this.planNo = planNo;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
}