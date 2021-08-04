package org.perscholas.caseManager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.extension.ExtendWith;
import org.perscholas.caseManager.config.WebAppConfig;
import org.perscholas.caseManager.models.Case;
import org.perscholas.caseManager.services.CaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = { WebAppConfig.class })
@WebAppConfiguration("webapp")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class CaseServiceIT {
	
	private CaseService caseService;
	private Case expected;
	
	@Autowired
	public CaseServiceIT(CaseService caseService) {
		this.caseService = caseService;
	}
	
	/**
	 * @see: https://www.baeldung.com/java-beforeall-afterall-non-static
	 * @see: https://junit.org/junit5/docs/5.0.1/api/org/junit/jupiter/api/TestInstance.html
	 */
	@BeforeAll
	void setup() {
		Case u = new Case();
		expected = caseService.createCase(u);
	}
	
	@AfterAll
	void clearSetup() {
		caseService.removeCase(expected);
	}
	
	@Test
	void testFindCaseByUserId() {
		Case actual = caseService.findCaseByCaseId(expected.getCaseId());
		assertEquals(expected, actual);
	}
	
}
