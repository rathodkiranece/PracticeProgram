//ThreadPriInfo
class ThreadPriInfo
{
	public static void main(String[] args) 
	{
		System.out.println("------------------------------------");
		System.out.println("default threads info");
		System.out.println("------------------------------------");
		Thread dt=Thread.currentThread();
		System.out.println("default Thread="+dt);//Thread[main,5,main]
		dt.setName("sathya");
		System.out.println("default Thread after modi="+dt);//Thread[sathya,5,main]
		boolean b=dt.isAlive();
		System.out.println("exec status of dt="+b);//true
		Thread.State dtts=dt.getState();
		System.out.println("exec state name of dt="+dtts);//RUNNABLE
		ThreadGroup tg=dt.getThreadGroup();
		System.out.println("ThreadGroup of dt="+tg);//ThreadGroup[name=main,maxpri=10]
		ThreadGroup ptg=tg.getParent();
		System.out.println("Parent of ThreadGroup dt="+ptg);//ThreadGroup[name=system,maxpri=10]
		ThreadGroup ppt=tg.getParent();
		System.out.println("Parent of Parent of ThreadGroup of dt="+ppt);//null
		System.out.println("------------------------------------");
		System.out.println("Prog def Thread info");
		System.out.println("------------------------------------");
		Thread t1=new Thread();
		String tname=t1.getName();
		System.out.println("defalut Threadname of prog created FGT="+tname);//thread-0
		boolean b1=t1.isAlive();
		System.out.println("ececute status of t1="+b1);//false
		Thread.State ts1=t1.getState();
		System.out.println("exec state name="+ts1);//NEW
		ThreadGroup tg1=t1.getThreadGroup();
		System.out.println("threadGroup of t1+"+tg1);//ThreadGroup[name=main,maxpri=10]
		ThreadGroup ptg1=tg1.getParent();
		System.out.println("Parent of Threagroup of t1="+ptg1);//ThreadGroup[name=System,maxpri=10]
		ThreadGroup pptg1=ptg1.getParent();
		System.out.println("Parent of Parent of Thread t1="+pptg1);//null
		System.out.println("val of maxpri="+Thread.MAX_PRIORITY);//10
		System.out.println("val of minpri="+Thread.MIN_PRIORITY);//1
		System.out.println("val of normpri="+Thread.NORM_PRIORITY);//5
		System.out.println("------------------------------------");
}
}
