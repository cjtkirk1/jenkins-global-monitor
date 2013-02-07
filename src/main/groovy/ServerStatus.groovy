class ServerStatus {
	String color
	String ip
	String url
	String health
	String message
	HudsonJob mostRecentJob
	List problemJobs
	
	ServerStatus( 
		String color, String ip, String url, String health, String message, 
		HudsonJob mostRecentJob, List problemJobs ) {
		
		this.color = color
		this.ip = ip
		this.url = url
		this.health = health
		this.message = message
		this.mostRecentJob = mostRecentJob
		this.problemJobs = problemJobs
	}
}