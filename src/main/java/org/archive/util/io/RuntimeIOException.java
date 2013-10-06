package org.archive.util.io;

public class RuntimeIOException extends RuntimeException {
    private static final long serialVersionUID = 4762025404760379497L;
    
    private int status = 503;
    
    public RuntimeIOException()
    {
    	
    }
    
    public RuntimeIOException(int status)
    {
    	this.status = status;
    }
    
    public RuntimeIOException(Throwable cause)
    {
    	super(cause);
    }   
    
    public int getStatus()
    {
    	return status;
    }
}
