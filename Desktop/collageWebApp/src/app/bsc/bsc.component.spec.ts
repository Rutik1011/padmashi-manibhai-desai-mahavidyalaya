import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BscComponent } from './bsc.component';

describe('BscComponent', () => {
  let component: BscComponent;
  let fixture: ComponentFixture<BscComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [BscComponent]
    });
    fixture = TestBed.createComponent(BscComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
