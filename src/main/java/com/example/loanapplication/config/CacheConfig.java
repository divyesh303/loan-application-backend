import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.context.annotation.Primary;
import org.springframework.cache.annotation.EnableAspectJCache;
import org.springframework.scheduling.annotation.EnableScheduling;
import java.time.Duration;
import org.springframework.cache.config.CacheConfiguration;

@Configuration
@EnableCaching
@EnableScheduling
public class CacheConfig {

    @Bean
    public CacheManager cacheManager() {
        ConcurrentMapCacheManager cacheManager = new ConcurrentMapCacheManager();
        cacheManager.setCacheNames(List.of("loanSubmission"));
        return cacheManager;
    }

    @Cacheable(value = "loanSubmission", key = "#loanId", sync = true)
    public LoanSubmissionDetail getLoanSubmissionDetail(Long loanId) {
        // method implementation
    }

    @CachePut(value = "loanSubmission", key = "#loanId")
    public LoanSubmissionDetail updateLoanSubmissionDetail(Long loanId, LoanSubmissionDetail detail) {
        // method implementation
    }

    @CacheEvict(value = "loanSubmission", key = "#loanId")
    public void evictLoanSubmissionDetail(Long loanId) {
        // method implementation
    }
}