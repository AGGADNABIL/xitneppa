package com.tyba.technicalServices.core;

public interface IConcurrentAccessManager {

	ProcessResult doCheckConcurrentAccess(UseCaseController useCaseController);

}
