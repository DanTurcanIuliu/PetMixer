package dk.via.sep3.services;

import io.grpc.Status;

public class GrpcError
{
    public static Throwable constructException(String message)
    {
        return Status.INVALID_ARGUMENT.withDescription(message).asRuntimeException();
    }
}