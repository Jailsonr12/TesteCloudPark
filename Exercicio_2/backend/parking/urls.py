from django.urls import path
from .views  import *

app_name="parking"

urlpatterns = [
    
    path('api/v1/customer/', CustomerView.as_view()),
    path('api/v1/plan/', PlanView.as_view()),
    path('api/v1/vehicle/', VehicleView.as_view()),
    path('api/v1/contract/', ContractView.as_view()),
    path('api/v1/customervehicle/', VehicleView.as_view()),
    path('api/v1/customerplan/', CustomerPlanView.as_view()),
    path('api/v1/parkmovement/', ParkMovementView.as_view()),
]

