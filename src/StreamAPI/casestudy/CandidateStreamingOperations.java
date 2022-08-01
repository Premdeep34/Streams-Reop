package StreamAPI.casestudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CandidateStreamingOperations {

	public static void main(String[] args) {
		InterviewRepository ir = new InterviewRepository();
		List<Candidate> candidates = new ArrayList<>();
		candidates = ir.getCandidateList();
	
		//list candidate names from Pune city ------------------------------------------
//		System.out.println("List of Pune Candidates:");
//		
//		candidates.stream()
//			.filter(c -> c.getCity().equals("Pune"))
//			.map(cd -> cd.getName())
//			.forEach(System.out::println);

		//list city and count of candidates per city --------------------------------------
//		System.out.println("Candidate count per city");
//		
//		Map<String, Long> cocpc = candidates.stream().collect(
//				Collectors.groupingBy(
//						Candidate::getCity,
//						Collectors.counting()));
//		
//		System.out.println(cocpc);

		//list technical expertise and count of candidates ----------------------------------------
//		System.out.println("Candidate count by Technical Expertise");
//		
//		Map<String, Long> cocbte = candidates.stream().collect(
//				Collectors.groupingBy(
//						Candidate::getTechnicalExpertise,
//						Collectors.counting()));
//		
//		System.out.println(cocbte);
		
		//list fresher candidates ----------------------------------------
//		System.out.println("Fresher Candidate list");
//		
//		candidates.stream()
//			.filter(c -> c.getYearsOfExperience() < 1)
//			.map(cd -> cd)
//			.forEach(System.out::println);
		
		//listing candidates with highest experience -----------------------------
//		System.out.println("Highest Experienced candidates");
//		
//		Optional<Candidate> maxExp = candidates.stream()
//			.max(Comparator.comparing(Candidate::getYearsOfExperience));
//		
//		System.out.println(maxExp);
		
		//Sorted list by experience ------------------------------
//		System.out.println("Sorted List of Candidates by Experience");
//		
//		candidates.stream()
//			.sorted((c1, c2) -> c1.getYearsOfExperience() > c2.getYearsOfExperience() ? 1 :
//				(c1.getYearsOfExperience() < c2.getYearsOfExperience() ? -1 : 0))
//			.forEach(System.out::println);

		//sort the candidates by city name ----------------------------------
//		printLine();
//		System.out.println("Sorted List of Candidates by City Name");
//		
//		candidates.stream()
//			.sorted(Comparator.comparing(Candidate::getCity))
//			.forEach(System.out::println);
//	}

	private static void printLine() {
		// TODO Auto-generated method stub
		System.out.println("======================================================");
	}
}