package play.le.common.logger;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


public class ApiLogger {
	
	public static long MC_FIRE_TIME=200; //MC操作超时
	
	public static long DB_FIRE_TIME=500; //DB操作超时
	
	public static long REDIS_FIRE_TIME=300; //Redis操作超时

	private static Logger log = Logger.getLogger("api");
	private static Logger infoLog = Logger.getLogger("info");
	private static Logger warnLog = Logger.getLogger("warn");
	private static Logger errorLog = Logger.getLogger("error");
	
	private static Logger testLog = Logger.getLogger("testlog");
	private static Logger redoLog = Logger.getLogger("redoLog");
	private static Logger fireLog = Logger.getLogger("fire");
	
	private static Logger accesslog = Logger.getLogger("accesslog");
	private static Logger accesserrorlog = Logger.getLogger("accesserrorlog");

	
	private static Logger scribeLog = Logger.getLogger("scribe");
	/* 核心队列推动日志中心Logger */
	private static Logger mqprocscribeLog = Logger.getLogger("mqprocscribe");
	
	static{
		Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run(){
                LogManager.shutdown();
            }
        });
	}
	
	/**
	 * perf4j log
	 */
	private static final Logger prefLogger = Logger.getLogger("perf4j");

	public static boolean isTraceEnabled() {
		return log.isTraceEnabled();
	}

	public static boolean isDebugEnabled() {
		return log.isDebugEnabled();
	}

	public static void trace(Object msg) {
		log.trace(msg);
	}

	public static void debug(Object msg) {
		if (log.isDebugEnabled()) {
			log.debug(msg);
		}
	}
	public static void accesslog(Object msg) {
		if (accesslog.isDebugEnabled()) {
			accesslog.debug(msg);
		}
	}
	public static void accesserrorlog(Object msg) {
		if (accesserrorlog.isDebugEnabled()) {
			accesserrorlog.debug(msg);
		}
	}
	
	public static void fire(Object msg) {
		if (fireLog.isInfoEnabled()) {
			fireLog.info(msg);
		}
	}
	
	public static void logRedo(Object msg, Throwable e){
		redoLog.warn(msg, e);
	}

	public static void scribe(Object msg) {
		if (scribeLog.isDebugEnabled()) {
			scribeLog.debug(msg);
		}
	}

	/**
	 * scribe for mqproc
	 * @param msg
	 */
	public static void mqprocScribe(Object msg) {
		try {
			if (mqprocscribeLog.isDebugEnabled()) {
				mqprocscribeLog.debug(msg);
			}
		} catch(Exception e) {
			error("write mqproc scribe error!", e);
		}
	}
	
	public static void info(Object msg) {
		if (infoLog.isInfoEnabled()) {
			infoLog.info(msg);
		}
	}

	public static void warn(Object msg) {
		warnLog.warn(msg);
	}

	public static void warn(Object msg, Throwable e) {
		warnLog.warn(msg, e);
	}

	public static void error(Object msg) {
		errorLog.error(msg);
	}

	public static void error(Object msg, Throwable e) {
		errorLog.error(msg, e);
	}

	public static void logForTest(Object msg) {
		testLog.info(msg);
	}

	public static void logForTest(Object msg, Throwable e) {
		testLog.info(msg, e);
	}

}
