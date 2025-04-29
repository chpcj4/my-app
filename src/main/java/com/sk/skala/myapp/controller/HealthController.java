@RestController
@RequestMapping("/health")
public class HealthController {

    /**
     * Startup Probe용 API
     */
    @GetMapping("/startup")
    public ResponseEntity<String> startup() {
        return ResponseEntity.ok("Startup OK");
    }

    /**
     * Liveness Probe용 API
     */
    @GetMapping("/liveness")
    public ResponseEntity<String> liveness() {
        return ResponseEntity.ok("Liveness OK");
    }

    /**
     * Readiness Probe용 API
     */
    @GetMapping("/readiness")
    public ResponseEntity<String> readiness() {
        return ResponseEntity.ok("Readiness OK");
    }
}
