class HudsonJob {
	String name
	String url
	String jobColor
	String activity
	String lastBuildTime

	HudsonJob( String name, String url, String jobColor, String activity, String lastBuildTime) {
		this.name = name
		this.url = url
		this.jobColor = jobColor
		this.activity = activity
		this.lastBuildTime = lastBuildTime
	}

	String getRecentBuildMessage() {
		return isBuilding() ? 
			"Building now..." : 
			new HudsonTimeComparator( lastBuildTime ).getDisplayTime()	
	}
		
	String toString() {
		return "${name}, ${jobColor}, ${activity}, ${lastBuildTime}, ${url}"
	}
	
	boolean isBuilding() {
		return activity.equals("Building") ? true : false
	}
	
	
}
