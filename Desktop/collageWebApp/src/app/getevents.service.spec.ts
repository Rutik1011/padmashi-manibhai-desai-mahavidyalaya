import { TestBed } from '@angular/core/testing';

import { GeteventsService } from './getevents.service';

describe('GeteventsService', () => {
  let service: GeteventsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GeteventsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
