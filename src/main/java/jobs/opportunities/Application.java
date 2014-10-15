package jobs.opportunities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.stereotype.Service;

@Configuration
@EnableJpaRepositories
@Import(RepositoryRestMvcConfiguration.class)
@EnableAutoConfiguration
@ComponentScan(excludeFilters = @ComponentScan.Filter({ Service.class, Configuration.class }))  //with no default packages set scans from this package higher
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

//	@PostConstruct
//	private void load() {
//
//		Address addr = addresses.save(new Address(
//				Arrays.asList("123 W. 1st St."),
//				"Univille",
//				"US",
//				"12345"
//		));
//
//
//		Profile twitter = profiles.save(new Profile("twitter", "http://twitter.com/john_doe"));
//
//
//		Map<String, Profile> profs = new HashMap<String, Profile>();
//		profs.put("twitter", twitter);
//
//		hello.PersonOld johnDoe = people.save(new hello.PersonOld(
//				"John Doe",
//				Arrays.asList(addr),
//				profs
//		));
//
//
//	}
}
