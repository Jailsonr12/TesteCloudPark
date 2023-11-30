# Generated by Django 4.2.7 on 2023-11-30 04:39

from django.db import migrations, models
import django.db.models.deletion


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='Contract',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('description', models.CharField(max_length=50)),
                ('max_value', models.FloatField(null=True)),
            ],
        ),
        migrations.CreateModel(
            name='Customer',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('name', models.CharField(max_length=50)),
                ('card_id', models.CharField(max_length=10, null=True)),
            ],
        ),
        migrations.CreateModel(
            name='Plan',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('description', models.CharField(max_length=50)),
                ('value', models.FloatField()),
            ],
        ),
        migrations.CreateModel(
            name='Vehicle',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('plate', models.CharField(max_length=10)),
                ('model', models.CharField(max_length=30, null=True)),
                ('description', models.CharField(max_length=50, null=True)),
                ('customer_id', models.ForeignKey(null=True, on_delete=django.db.models.deletion.CASCADE, to='parking.customer')),
            ],
        ),
        migrations.CreateModel(
            name='ParkMovement',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('entry_date', models.DateTimeField()),
                ('exit_date', models.DateTimeField(null=True)),
                ('value', models.FloatField(null=True)),
                ('vehicle_id', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='parking.vehicle')),
            ],
        ),
        migrations.CreateModel(
            name='CustomerPlan',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('due_date', models.DateTimeField(null=True)),
                ('customer_id', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='parking.customer')),
                ('plan_id', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='parking.plan')),
            ],
        ),
        migrations.CreateModel(
            name='ContractRule',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('until', models.IntegerField()),
                ('value', models.FloatField()),
                ('contract_id', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='parking.contract')),
            ],
        ),
    ]
